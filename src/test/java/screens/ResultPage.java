package screens;

import testUI.elements.UIElement;

import static testUI.elements.TestUI.*;

public class ResultPage {

    UIElement emptyDesc = Ex("//android.view.View[2]/android.view.View[2]"),
            outputCheck = Ex("//android.widget.GridView/android.view.View[1]");

    public void emptyBoardValidation() {
        emptyDesc.waitFor(2)
                .untilIsVisible()
                .shouldHave()
                .exactText("Sludinājumi dotajā kategorijā nav atrasti");
    }

    public void searchOutputValidation() {
        outputCheck.waitFor(2).untilIsVisible();
    }
}
