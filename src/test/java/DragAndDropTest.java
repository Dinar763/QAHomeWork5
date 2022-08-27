
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class DragAndDropTest {

    @Test
    public void testCheckDragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
//        actions().moveToElement($("#column-a")).clickAndHold()
//            .moveToElement($("#column-b")).release().perform();
//        $("#column-b").hover();
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));
    }
}
