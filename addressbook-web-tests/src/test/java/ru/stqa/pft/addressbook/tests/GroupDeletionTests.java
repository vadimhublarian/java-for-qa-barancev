package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Vadim Khublarian on 10/9/18.
 */
public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroup();
        app.returnToGroupPage();
    }

}

