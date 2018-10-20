package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

/**
 * Created by Vadim Khublarian on 10/9/18.
 */
public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroup();
        returnToGroupPage();
    }

}

