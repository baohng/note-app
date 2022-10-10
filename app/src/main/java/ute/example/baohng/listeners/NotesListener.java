package ute.example.baohng.listeners;

import ute.example.baohng.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
