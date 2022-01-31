import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private _activate:ActivatedRoute) { }

  username :any=undefined;

  ngOnInit(): void {
     this._activate.parent?.params.subscribe((p : Params)=>{
       this.username=p['un'];
     })

  }

}
