package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

/**
 * Created by Vadim Khublarian on 10/9/18.
 */
public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("TestGroup1", "TestGroup1 header", "TestGroup1 footer"));
        submitGroupCreation();
        returnToGroupPage();
    }

}

