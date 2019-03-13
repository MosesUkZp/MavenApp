package package_2;

public class Bird {

    protected int color;
    protected int hz;
    protected final String name;

    public Bird(final String name) {
        this.name = name;
    }

    public void walk () {
        System.out.println("I am walking");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bird bird = (Bird) o;

        if (color != bird.color) return false;
        if (hz != bird.hz) return false;
        return name != null ? name.equals(bird.name) : bird.name == null;
    }

    @Override
    public int hashCode() {
        int result = color;
        result = 31 * result + hz;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

