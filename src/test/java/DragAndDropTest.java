import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DragAndDropTest {

    @Test
    public void testCheckDragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
//        actions().moveToElement($("#column-a")).clickAndHold()
//            .moveToElement($("#column-b")).release().perform();
//        $("#column-b").hover();
        assertEquals("A", $("#column-b").getText());
        assertEquals("B", $("#column-a").getText());
    }
}
