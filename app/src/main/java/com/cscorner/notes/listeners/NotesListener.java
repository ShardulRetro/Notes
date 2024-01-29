package com.cscorner.notes.listeners;

import com.cscorner.notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
