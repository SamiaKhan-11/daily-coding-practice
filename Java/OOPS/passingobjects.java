class passingobjects {

    int v = 10;

    passingobjects m1(passingobjects s) {
        s.v = s.v + 10;
        return s;
    }

    public static void main(String args[]) {

        passingobjects s1 = new passingobjects();

        passingobjects obj = new passingobjects();
        obj.m1(s1);

        System.out.print(s1.v);
    }
}