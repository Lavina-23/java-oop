package src.practice.app;

import src.practice.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();

        // with private "id"
        category.setId("ID");
        category.setId(null);

        // use the method to print category fields
        System.out.println(category.getId()); // -> will print "ID", because it has been validated first in the getId()
        System.out.println(category.isExpensive());

        // if the "id" is public :
        // category.id = null;
        // System.out.println(category.id); -> the result is "null" and it's dangerous,
        // that's why we should use private

    }
}
