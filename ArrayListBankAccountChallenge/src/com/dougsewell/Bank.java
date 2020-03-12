package com.dougsewell;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> Branches = new ArrayList<Branch>();

    public void addBranch(String branchName) {
        if(canAddNewBank(branchName)) {
            Branches.add(new Branch(branchName));
            System.out.println("New branch added");
        } else {
            System.out.println("ERROR: Branch name taken.");
        }
    }

    private boolean canAddNewBank(String branchName) {
        if(Branches.size() == 0) {
            return true;
        }

        int iterator = 0;

        do {
            if(branchName.equals(Branches.get(iterator).getBranchName())) {
                return false;
            }
            iterator++;
        } while(iterator < Branches.size());

        return true;
    }

}
