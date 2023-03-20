package object.interfaceA.test;

public class Test {
    public static void main(String[] args) {
        PingpangStorper pps = new PingpangStorper("zs", 14);
        pps.study();
        pps.speakEnglish();
        PingpangCoach ppc = new PingpangCoach("ls", 45);
        ppc.teach();
        ppc.speakEnglish();
    }
}
