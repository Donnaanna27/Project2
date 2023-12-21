package Steps;

import PageObject.LaptopsNotebooks;
import com.codeborne.selenide.Condition;



public class LaptopsNotebooksSteps extends LaptopsNotebooks {

    public LaptopsNotebooksSteps LaptopsNotebooksPage() {
        LaptopsNotebooks.click();
        LaptopsNotebooksbtn.click();
        return this;
    }

    public LaptopsNotebooksSteps sortByPriceHighToLow() {
        sortby.click();
        sortbyPrice.click();
        return this;
    }


    public LaptopsNotebooksSteps checkItemPriceVisibility() {
        leptopprice.should(Condition.visible);
        return this;
    }

}
