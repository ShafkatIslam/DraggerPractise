package com.example.professt.draggerpractise.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.professt.draggerpractise.data.ListItem;
import com.example.professt.draggerpractise.data.ListItemRepository;

public class ListItemViewModel extends ViewModel {

    private ListItemRepository repository;

    ListItemViewModel(ListItemRepository repository) {
        this.repository = repository;
    }

    public LiveData<ListItem> getListItemById(String itemId){
        return repository.getListItem(itemId);
    }

}
