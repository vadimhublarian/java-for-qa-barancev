package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by Vadim Khublarian on 10/9/18.
 */
public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("TestGroup1", "TestGroup1 header", "TestGroup1 footer"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}

