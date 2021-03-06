package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.UserIterface.saucedemo_complete_checkout;
import starter.UserIterface.saucedemo_login;
import starter.UserIterface.saucedemo_form;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Navigate {
    public static Performable toTheCatalogPage() {
        return Task.where("{0} goes to the catalog page",
                Open.url("https://www.saucedemo.com/inventory.html"));
    }

    public static Performable saucedemo() {
        return Task.where("{0} goes to the catalog page",
                Open.url("https://www.saucedemo.com/"));
    }

    public static Performable toTheShoppingCart() {
        return Task.where("{0} opens the shopping cart",
                WaitUntil.the ( saucedemo_login.Span_products, isVisible ()).forNoMoreThan (20).seconds ()
        );
    }

    public static Performable toFrom() {
        return Task.where("{0} opens the form",
                WaitUntil.the ( saucedemo_form.Txt_firstName, isVisible ()).forNoMoreThan (20).seconds ()

        );

    }
    public static Performable img_pony() {
        return Task.where("{0} opens the finish checkout",
                WaitUntil.the ( saucedemo_complete_checkout.img_pony, isVisible ()).forNoMoreThan (20).seconds ()

        );}

}
