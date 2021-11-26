package com.company;

public abstract class DeliveryCompany {
    public abstract void title();

    private WorkingWithCustomers workingWithCustomers;

    public DeliveryCompany(WorkingWithCustomers workingWithCustomers) {
        this.workingWithCustomers = workingWithCustomers;
    }

    public void helpCustomers(){
        this.workingWithCustomers.customers();
    }

    public WorkingWithCustomers getWorkingWithCustomers() {
        return workingWithCustomers;
    }

    public void setWorkingWithCustomers(WorkingWithCustomers workingWithCustomers){
        this.workingWithCustomers = workingWithCustomers;
    }
}
