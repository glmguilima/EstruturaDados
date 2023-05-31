package Marco2.Trabalho2;

class Aluno {
    private String name;

    public Aluno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
