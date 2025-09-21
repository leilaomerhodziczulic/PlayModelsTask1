package controllers;

import models.Category;
import models.Product;
import play.mvc.*;

import java.math.BigDecimal;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result testDb(){
        Category juice = new Category("juice", "123", true);
        Product product = new Product("Orange Juice", "1234asd1234", new BigDecimal("1.25"), 10, juice);
        return ok("Information in database!");
    }
}
