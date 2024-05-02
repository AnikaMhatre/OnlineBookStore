import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Customer } from '../../customer';
import { CustomerService } from '../../Services/customer-service.service'; 
import Swal from 'sweetalert2';

@Component({
  selector: 'app-register-customer',
  templateUrl: './register-customer.component.html',
  styleUrl: './register-customer.component.css'
})
export class RegisterCustomerComponent implements OnInit {
  cPass : string = "";
  customer = new Customer(0,"","","","","");
  constructor( private route: ActivatedRoute, private router: Router,private customerService : CustomerService) { }
  ngOnInit(): void {

  }

  emailPattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$";

  onSubmit() {
    // console.log(this.customer);
    
    this.customerService.registerCustomer(this.customer).subscribe(
      (data:any)=>{
        Swal.fire({
        title: 'Success!',
        text: 'Your registration was successful.',
        icon: 'success',
        confirmButtonText: 'Cool'
      });
        // console.log(data);
        this.router.navigate(['']);
      }
    );
  }
}



