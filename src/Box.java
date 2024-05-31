class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;

    }

    double volume() {
        return width * height * depth;
    }

    int square(int i) {
        return (int) Math.pow(i, 2);
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 15);
        Box box2 = new Box(3, 6, 9);

        box.volume();
        box2.volume();

        System.out.println(box.square(2));
    }

}
