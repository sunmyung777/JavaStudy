package Practice;

public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember a=new FamilyMember("아빠");
        FamilyMember b=new FamilyMember("엄마");
        FamilyMember c=new FamilyMember("나");
        FamilyMember d=new FamilyMember("남동생");
        FamilyMember.printMemberCnt();
        PiggyBank.putMoney(a,10000);
        PiggyBank.putMoney(b,5000);
        PiggyBank.putMoney(c,2000);
        PiggyBank.putMoney(d,1000);
        PiggyBank.printBalance();
        PiggyBank.putMoney(c,1000);
        PiggyBank.printBalance();
    }
}
