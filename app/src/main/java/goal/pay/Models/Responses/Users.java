package goal.pay.Models.Responses;

import java.util.List;

public class Users {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }

    public List<Redeem> getRedeemRequests() {
        return redeemRequests;
    }

    public void setRedeemRequests(List<Redeem> redeemRequests) {
        this.redeemRequests = redeemRequests;
    }

    private String id;
    private String name;
    private String cpf;
    private Double balance;
    private List<History> history;
    private List<Redeem> redeemRequests;

}
