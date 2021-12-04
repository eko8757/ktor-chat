package com.eko8757.room

class MemberAlreadyExistException: Exception(
    "there is already a member with that username in the room."
)