import { Component } from '@angular/core';
import { Publisher } from '../../publisher';
import { PublisherService } from '../../Services/publisher.service';  
import Swal from 'sweetalert2';
import { Router } from '@angular/router';


@Component({
  selector: 'app-publisher',
  templateUrl: './publisher.component.html',
  styleUrl: './publisher.component.css'
})
export class PublisherComponent {
  publisher = new Publisher(0,"","","","",false);
  constructor(private publisherService : PublisherService,private router:Router){}
  
  public publisherRegister(){
    console.log(this.publisher);
    this.publisherService.registerPublisher(this.publisher).subscribe(
      (data:any)=>{
        Swal.fire({
          title: 'Success!',
          text: 'Your registration was successful.',
          icon: 'success',
          confirmButtonText: 'Cool'
        });
          // console.log(data);
          this.router.navigate(['publisherLogin']);
      }
    );
  }
  public back(){}
}
