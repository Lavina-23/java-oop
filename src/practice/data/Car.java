package src.practice.data;

public interface Car extends HasBrand /* , isMaintenance */ { // to inherits interface to interface use extends
    // by default method in interface is an public abctract class
    void drive();

    int getTier();
}
