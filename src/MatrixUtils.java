class Matrix {

    public Matrix(MatrixRow[] rows) {
        matrix = rows;
    }

    private MatrixRow[] matrix;

    public MatrixRow getRow(int i) {
        return matrix[i];
    }
    public void setRow(int i, MatrixRow other) {
        matrix[i] = other;
    }
    public void swapRows(int i,int j) {
    	MatrixRow t=matrix[i];
    	matrix[i]=matrix[j];
    	matrix[j]=t;
    }
    public void simplify() {
        for(int i=0; i < matrix.length; i++) {
            matrix[i].simplify();
        }
    }

    @Override
    public String toString() {
        simplify();
        String res = "[";
        for (int i=0; i < matrix.length; i++) {
            res += matrix[i];
            if (i < matrix.length-1) { res += ";"; }
        }
        res += "]";
        return res;
    }
}

class MatrixRow {

    public Rational[] row;

    public MatrixRow() {
        Rational allZeros[] = {new Rational(0,1), new Rational(0,1), new Rational(0,1)};
        this.row = allZeros;
    }

    public MatrixRow(Rational[] row) {
        this.row = row;
    }

    public MatrixRow multiplyBy(Rational times) {
        MatrixRow newRow = new MatrixRow();
        for(int i=0; i < row.length; i++) {
            newRow.row[i] = row[i].multiply(times);
        }
        return this;
    }

    public MatrixRow addRow(MatrixRow other) {
        MatrixRow newRow = new MatrixRow();
        for(int i=0; i < row.length; i++) {
            newRow.row[i] = row[i].plus(other.row[i]);
        }
        return this;
    }

    public void simplify() {
        for (int i = 0; i < row.length; i++) {
            row[i] = row[i].simplified();
        }
    }

    @Override
    public String toString() {
        String res = "";
        for(int i=0; i < row.length; i++) {
            res += row[i];
            if (i < row.length-1) { res += " "; }
        }
        return res;
    }
}


class Rational {

    public int numerator;
    public int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Error: denominator should not be 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational simplified() {
        Rational res = new Rational(this.numerator, this.denominator);
        for(int i=2; i <= res.numerator/2; i++) {
            if(res.numerator % i == 0 && res.denominator % i == 0) {
                res.numerator /= i;
                res.denominator /= i;
                i--;
            }
        }
        return res;
    }

    public Rational multiply(Rational other) {
        return new Rational(numerator * other.numerator, denominator * other.denominator);
    }

    public Rational plus(Rational other) {
        int num = numerator * other.denominator + denominator * other.numerator;
        int denom = this.denominator * other.denominator;
        return new Rational(num, denom);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}


