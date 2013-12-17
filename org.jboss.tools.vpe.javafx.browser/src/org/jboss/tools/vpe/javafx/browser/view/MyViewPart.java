package org.jboss.tools.vpe.javafx.browser.view;

import at.bestsolution.efxclipse.runtime.workbench3.FXViewPart;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;

public class MyViewPart extends FXViewPart {
	private WebView view;
	@Override
	protected Scene createFxScene() {
		BorderPane pane = new BorderPane();
		view = new WebView();
		view.getEngine().load("http://www.jboss.org");
		pane.setCenter(view);
		return new Scene(pane);
	}

	@Override
	protected void setFxFocus() {
		view.requestFocus();
	}
}