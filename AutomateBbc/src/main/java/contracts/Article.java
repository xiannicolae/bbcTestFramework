package contracts;

import org.openqa.selenium.WebElement;

/**
 * Created by christiann on 28/06/2017.
 */
public class Article {
    private String title;
    private String category;
    private String url;
    private int commentsCounter;
    private WebElement locator;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCommentsCounter() {
        return commentsCounter;
    }

    public void setCommentsCounter(int commentsCounter) {
        this.commentsCounter = commentsCounter;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebElement getLocator() {
        return locator;
    }

    public void setLocator(WebElement locator) {
        this.locator = locator;
    }
}
