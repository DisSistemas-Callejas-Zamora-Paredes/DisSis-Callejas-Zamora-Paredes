#!/usr/bin/python
#-*- coding: utf-8 -*-

from GUI import GUI

class Usuario(GUI):
    def __init__(self):
        self.id_usuario = None
        self.nombre = None
        self.dirección = None
        self.email = None
        self.password = None

    def registrarse(self, ):
        pass

    def inciarSesión(self, email, passwd):
        pass

