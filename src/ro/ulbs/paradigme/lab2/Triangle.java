package ro.ulbs.paradigme.lab2;

class Triangle extends Form {
    private float height, base;
    public Triangle(float v, float height, String red) {
        super();
        this.height = 0;
        this.base = 0;
    }
    public Triangle(String color, float height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }
    @Override
    public float getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Triunghi cu baza " + base + " si inaltimea " + height;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return Float.compare(triangle.height, height) == 0 && Float.compare(triangle.base, base) == 0;
    }


}