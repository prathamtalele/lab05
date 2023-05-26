package pratham_talele;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program_talele {

	 private static List<Data_talele> categories = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add  Category");
            System.out.println("2. List all Categories");
            System.out.println("3. Display Categories starting with 'E'");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCategory(scanner);
                    break;
                case 2:
                    listCategories();
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice try again.");
                    break;
            }

            System.out.println();
        } while (choice != 4);

        scanner.close();
    }

   

	private static void addCategory(Scanner scanner) {
        System.out.println("Enter the details of the Category:");

        System.out.print("Category ID: ");
        int catId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Category Name: ");
        String categoryName = scanner.nextLine();

        System.out.print("Category Description: ");
        String categoryDesc = scanner.nextLine();

        System.out.print("Category Image URL: ");
        String categoryImageUrl = scanner.nextLine();

        Data_talele category = new Data_talele(catId, categoryName, categoryDesc, categoryImageUrl);

        if (categories.contains(category)) {
            System.out.println("Category already exists!");
        } else {
            categories.add(category);
            System.out.println("Category added successfully!");
        }
    }

    private static void listCategories() {
        if (categories.isEmpty()) {
            System.out.println("No categories found.");
}
    }
    public void displayCategoriesStartingWithE() {
        categories.stream()
            .filter(category -> category.getCategoryName().startsWith("E"))
            .forEach(category -> System.out.println(category));
    
}

	}


