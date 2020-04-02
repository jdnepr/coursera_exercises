package com.example.sharingapp;
/**
 * Superclass of AddContactCommand, EditContactCommand, DeleteContactCommand,
 * AddItemCommand, EditItemCommand, DeleteItemCommand
 */
public abstract class Command {

    private boolean is_executed;

    public Command(){
        this.is_executed = false;
    }

    public abstract void execute();
    public boolean isExecuted(){
        return this.is_executed;
    }

    public void setIsExecuted(boolean is_executed){
        this.is_executed = is_executed;
    }
}
