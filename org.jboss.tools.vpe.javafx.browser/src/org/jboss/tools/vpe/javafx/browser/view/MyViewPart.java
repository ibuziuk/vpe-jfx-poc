package org.jboss.tools.vpe.javafx.browser.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.jboss.tools.vpe.javafx.browser.JavaFxBrowser;


public class MyViewPart extends ViewPart {
	public static final String ID = "pluginfx.views.MyViewPart";
	private JavaFxBrowser javaFxBrowser;
	private Browser swtWebKitBrowser;
	
	@Override
	public void createPartControl(Composite parent) {
		javaFxBrowser = new JavaFxBrowser(parent);
		swtWebKitBrowser = new Browser(parent, SWT.WEBKIT);
		swtWebKitBrowser.setUrl("http://webkit.org");
	}

	@Override
	public void setFocus() {
		javaFxBrowser.setFocus();
	}
}