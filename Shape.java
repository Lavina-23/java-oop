class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 4; // overrides the parent's method
    }

    // to access parent's method, use keyword 'super'
    int getParentCorner() {
        return super.getCorner();
    }
}
