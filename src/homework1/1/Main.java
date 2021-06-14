package homework1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "C:/Users/solov/IdeaProjects/HillelJavaElementarySolovei/src/homework1/resources/File.txt";

        homework1.Admin admin = new homework1.Admin();
        admin.setName("Michael");
        admin.setSurname("Kebede");
        admin.setAge(26);
        admin.setMail("michaelkebede01@gmail.com");
        admin.setPassword("kebede634512");

        homework1.User user = new homework1.User();
        user.setName("Sonya");
        user.setSurname("Lisovskaya");
        user.setAge(19);
        user.setMail("sonyalisovskaya11221@gmail.com");
        user.setPassword("s1o2n3y4a5");

        homework1.UserService userService = new homework1.UserService();
        userService.setFilePath(filePath);
        userService.writeUserData(user);

        homework1.AdminService adminService = new homework1.AdminService();
        adminService.setFilePath(filePath);
        adminService.writeUserData(user);
        adminService.writeUserData(admin);


        System.out.println(userService.check(admin));
        System.out.println(adminService.check(user));
    }
}
