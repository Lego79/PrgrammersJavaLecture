package cafeScanner.service;

import cafeScanner.Menu;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuService {

    private List<Menu> menuList;



    public MenuService(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public MenuService() {
        this.menuList = new ArrayList<>();
    }



    private static final String MENU_FILE_PATH = "C:\\cafeMenu/menu.dat";

    DecimalFormat df = new DecimalFormat("#,###");

    public void printMenu() {
        Scanner sc = null;
        Reader reader = null;
        try {
            reader = new FileReader(MENU_FILE_PATH);
            sc = new Scanner(reader);

            while (sc.hasNextLine()) {
                String drink = sc.nextLine();
                String[] field = drink.split(",");
                int No = Integer.parseInt(field[0]);
                int price = Integer.parseInt(field[3]);
                menuList.add(new Menu(No, field[1], field[2], price));
            }

            for(int i = 0; i < menuList.size(); i++) {
                System.out.print(menuList.get(i).getId() + ".");
                menuList.get(i).printInfo();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (sc != null) {
                sc.close();
            }
        }
    }

//	public void printMenu() {
//	    try (Reader reader = new FileReader(MENU_FILE_PATH);
//	         Scanner sc = new Scanner(reader)) {
//	        while (sc.hasNextLine()) {
//	            String line = sc.nextLine();
//	            String[] menuInfo = line.split(",");
//
//	            if (menuInfo.length == 4) {
//	                int id = Integer.parseInt(menuInfo[0]);
//	                String category = menuInfo[1];
//	                String name = menuInfo[2];
//	                int price = Integer.parseInt(menuInfo[3]);
//
//	                String formattedPrice = df.format(price);
//
//	                String menuLine = id + ". " + category + " : " + name + " " + formattedPrice + "(원)";
//	                System.out.println(menuLine);
//	            }
//	        }
//	    } catch (IOException e) {
//	        System.out.println("메뉴를 읽어오는 도중 오류가 발생했습니다: " + e.getMessage());
//	    }
//	}

    public void addMenu() {
        Scanner sc = new Scanner(System.in);
        Writer writer = null;

        try {
            writer = new FileWriter(MENU_FILE_PATH, true);

            System.out.println("메뉴번호를 입력하세요 => ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("메뉴 카테고리를 입력하세요(커피,에이드,케이크) => ");
            String category = sc.nextLine();

            System.out.println("메뉴명을 입력하세요 => ");
            String name = sc.nextLine();

            System.out.println("가격을 입력하세요 => ");
            int price = Integer.parseInt(sc.nextLine());

            String menuInfo = id + "," + category + "," + name + "," + price + "\n";
            writer.write(menuInfo);

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            sc.close();
        }

        // Update the menuList
        printMenu();
    }

    public void updateMenu() {




    }

    public void deleteMenu() {





    }

}
