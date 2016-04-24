package be.swsb.productivity.chapter8;

public class Chapter8 {

    public Chapter8() {
        String output =
                "This sure is"
                "one hell of a"
                "long list of"
                "string concatenations"
                "that don't seem to"
                "have any purpose"
                "other than to"
                "prove the point"
                "of column mode"
                ;
    }

    public void multiCursors() {
        String output = new StringBuilder()
                ."Multiple cursors"
                ."really are"
                ."an insanely powerful"
                .toString();
    }

    public void areTheBest() {
        String output = new StringBuilder()
                ."feature that"
                ."is greatly"
                ."underused and"
                ."also greatly"
                ."underestimated"
                .toString();
    }

    public void ignoreThisOne(){
        String output = new StringBuilder()
                .append("press alt+shift+j")
                .append("if you've gone too far")
                .append("when adding")
                .append(".")
                .toString();
    }
}
