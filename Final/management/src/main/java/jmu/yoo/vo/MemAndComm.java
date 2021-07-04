package jmu.yoo.vo;

import java.util.List;

public class MemAndComm {
    private  Member member;
    private List<Community> communities;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }

    @Override
    public String toString() {
        return "MemAndComm{" +
                "member=" + member +
                ", communities=" + communities +
                '}';
    }
}
