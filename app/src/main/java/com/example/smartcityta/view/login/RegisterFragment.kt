package com.example.smartcityta.view.login

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.smartcityta.R
import com.example.smartcityta.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonRegister.setOnClickListener{

            var validData = 0;
            val username = binding.editTextUsername.text.toString()
            val password = binding.editTextPassword.text.toString()
            val ulangiPassword = binding.editTextUlangiPassword.text.toString()
            val nama = binding.editTextNama.text.toString()
            val email = binding.editTextEmail.text.toString()
            val alamat = binding.editTextAlamat.text.toString()


            if(username.isEmpty()){
                binding.editTextUsername.error = "Field masih kosong"
            } else if(username.length <4){
                binding.editTextUsername.error = "Minimal panjang 4 karakter"
            }
            else {
                validData+=1
            }

            if(password.isEmpty()){
                binding.editTextPassword.error = "Field masih kosong"
            } else {
                validData += 1
            }

            if(ulangiPassword.isEmpty()){
                binding.editTextUlangiPassword.error = "Field masih kosong"
            } else if(ulangiPassword != password){
                binding.editTextPassword.error = "Password tidak sama"
                binding.editTextUlangiPassword.error = "Password tidak sama"
            } else {
                validData +=1
            }

            if(nama.isEmpty()){
                binding.editTextNama.error = "Field masih kosong"
            } else {
               validData+=1
            }

            if(email.isEmpty()){
                binding.editTextEmail.error = "Field masih kosong"
            } else {
                validData += 1
            }

            if(alamat.isEmpty()){
                binding.editTextAlamat.error = "Field masih ksong"
            } else {
                validData += 1
            }

            if(validData==6){
                binding.editTextUsername.text.clear()
                binding.editTextPassword.text.clear()
                binding.editTextUlangiPassword.text.clear()
                binding.editTextNama.text.clear()
                binding.editTextEmail.text.clear()
                binding.editTextAlamat.text.clear()
            }


        }
    }


}