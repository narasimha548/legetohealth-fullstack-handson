import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-success',
  templateUrl: './success.component.html',
  styleUrls: ['./success.component.css']
})
export class SuccessComponent implements OnInit {

  constructor(private activateRoute : ActivatedRoute) { }

  username : any =undefined;

  ngOnInit(): void {

    this.activateRoute.params.subscribe((p : Params)=>{
    this.username=p['un'];
    })
  }


}
