package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Somsuk","1111");
        userList.addUser("Samornsri","2222");
        userList.addUser("Yongsuk","3333");

        // TODO: find one of them
        User user = userList.findUserByUsername("Samornsri");

        // TODO: assert that UserList found User
        String expected = "Samornsri";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Somsuk","1111");
        userList.addUser("Samornsri","2222");
        userList.addUser("Yongsuk","3333");

        // TODO: change password of one user
        boolean actual = userList.changePassword("Yongsuk","3333","LOVE!");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Somsuk","1111");
        userList.addUser("Samornsri","2222");
        userList.addUser("Yongsuk","3333");

        // TODO: call login() with correct username and password
        User actual = userList.login("Somsuk","1111");

        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("Somsuk");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Somsuk","1111");
        userList.addUser("Samornsri","2222");
        userList.addUser("Yongsuk","3333");

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Somsuk","5555");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}