import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest {

    @Test
    public void checkPricingDownloadTest() {
        open("https://github.com/");
        $(byTagAndText("summary", "Pricing")).hover();
        $(byText("Compare plans")).click();
        $(".h2-mktg").shouldHave(text("Get the complete developer platform."));
    }
}
