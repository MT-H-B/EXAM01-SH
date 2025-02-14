package Quiz.Quiz6;

public class Bank {
    String name;
    long balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    public Bank(String name, int balance) {
        setName(name);
        setBalance(balance);
    }
    public long withdrawal(long amount) {
        if (amount > balance) {
            System.out.println("잔액부족으로 출금할 수 없습니다.");
            return 0;
        }
        else {
            balance -= amount;
            return balance;
        }
    }

    public void deposit(long amount) {
        this.balance += amount;
    }
}
