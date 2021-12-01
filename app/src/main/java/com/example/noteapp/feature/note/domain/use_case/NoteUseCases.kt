package com.example.noteapp.feature.note.domain.use_case

data class NoteUseCases(
    val addNoteUseCase: AddNoteUseCase,
    val getNotesUseCase: GetNotesUseCase,
    val getNoteUseCase: GetNoteUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
)
