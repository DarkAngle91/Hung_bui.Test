import entity.Role;
import entity.User;
import repository.UserRepository;

import java.util.List;

public class Program {
    public static void main(String[] args) {
//        bai2();
//        bai3(1);
//        bai4(3);
        taoUser();
    }


//    static void bai2() {
//        System.out.println("---------------Bai 2---------------");
//        List<User> all = UserRepository.findAll();
//        System.out.printf("%-10s | %-20s | %-15s\n", "ID", "FULL_NAME", "EMAIL");
//        System.out.println("____________________________________________________________");
//        for (User user : all) {
//            System.out.printf("%-10s | %-20s | %-15s\n", user.getUserId(), user.getFullName(), user.getEmail());
//        }
//    }
//
//    private static void bai3(int userId) {
//        System.out.println("---------------Bai 3---------------");
//        User user = UserRepository.findById(userId);
//        System.out.println(user);
//    }
//    private static void bai4(int userId) {
//        System.out.println("---------------Bai 4---------------");
//        boolean deleted = UserRepository.deleteById(userId);
//      if (deleted){
//          System.out.println("Delete thanh cong");
//      }else
//          System.out.println("Delete that bai");
//    }

    static void taoUser(){
        User user = new User();
        user.setEmail("thanhhung@gmail.com");
        user.setFullName("Hung Bui");
        user.setPassword("123456");
        user.setRole(Role.EMPLOYEE);
        user.setExpInYear(2);
        user.setProSkill("Java");
        UserRepository.createUser(user);
    }

}

