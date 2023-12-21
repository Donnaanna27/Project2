package Steps;

import PageObject.Desktops;

import static com.codeborne.selenide.Condition.text;

public class DesktopsSteps extends Desktops {

    public DesktopsSteps hoverOverIpodShuffleAndGetText() {
        Decktop.click();
        AllDesktop.click();
        Mp3player.click();
        iPodShufflelink.scrollIntoView(true);
        IpodShuffle.hover();
        iPodShufflelink.click();
        addToCard.click();
        items.click();
        CheckOut1.click();
        return this;
    }

    public DesktopsSteps checkProductInCart() {
        CheckOut1.click();
        return this;
    }

    public DesktopsSteps fillForm() {
        firstName.setValue("");
        lastName.setValue("");
        company.setValue("");
        Address1.setValue("");
        City.setValue("");
        postcode.setValue("");
        country.click();

        // Adding logic to select country based on the given region
        if ("Georgia".equals(region)) {
            country.find(String.valueOf(text("Tbilisi"))).click();
        } else if ("Europe".equals(region)) {
            country.find(String.valueOf(text("Georgia"))).click();
            // Add more cases as needed
        } else {// Handle default case or throw an exception if the region is not recognized
            throw new IllegalArgumentException("Unsupported region: " + region);
        }

        return this;
    }

    public DesktopsSteps continueBtns() {
        continuebtn1.click();
        continuebtn2.click();
        continuebtn3.click();
        checkOut2.click();
        continuebtn4.click();

        subTotal.shouldHave(text("$100.00"));

        flatShippingRate.shouldHave(text("$5.00"));

        TotalPrice.shouldHave(text("$105.00"));

        return this;
    }

    public DesktopsSteps confirmOrder() {
        confirmOrderbtn.click();
        succsefulorder.shouldHave(text("Your order has been placed!"));
        return this;
    }
}
