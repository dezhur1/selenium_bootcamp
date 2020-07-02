package pageObject.day3;

import core.BaseFunc;
import model.Article;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DelfiArticlePage extends BaseFunc {

    public DelfiArticlePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.TAG_NAME, using = "//div[contains(@class, 'article-title mb-3 ')]")//
    private WebElement titleAndComment;

    public Article getArticleAtributes(){
        waitElementAppeared(titleAndComment);

        Article commentCount = new Article();

        commentCount.setTitle(titleAndComment.findElement(By.xpath(".//h1")).getText());
        List<WebElement> commentsArticle = titleAndComment.findElements(By.xpath(".//a[contains()"));
        if(commentsArticle.isEmpty()) {
            commentCount.setCommentNumber(0);
        } else {
            commentCount.setCommentNumber(commentsArticle.get(0).getText());
        }
        return commentCount;
    }
}
