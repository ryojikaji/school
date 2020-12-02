import { Injectable } from '@angular/core';
import { of } from 'rxjs/internal/observable/of';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor() {}

  findAll(): string[]{
    if (localStorage.getItem('todolist') != null) {
      return JSON.parse(localStorage.getItem('todolist'));
    }
    return null;
  }
  findAll2(): string[]{
    if (localStorage.getItem('todolistDone') != null) {
      return JSON.parse(localStorage.getItem('todolistDone'));
    }
    return null;
  }

  add(title: string): void {
    if (localStorage.getItem('todolist') == null) {
      let list: string[] = [];
      list.push(title);
      localStorage.setItem('todolist',JSON.stringify(list));
    } else {
      let list: string[] = JSON.parse(localStorage.getItem('todolist'));
      list.push(title);
      localStorage.setItem('todolist',JSON.stringify(list));
    }
  }

  done(index: number): void{
    let list: string[] = JSON.parse(localStorage.getItem('todolist'));
    let title: string = list[index];
    list.splice(index,1);
    localStorage.setItem('todolist',JSON.stringify(list));

    if (localStorage.getItem('todolistDone') == null) {
      let list2: string[] = [];
      list2.push(title);
      localStorage.setItem('todolistDone',JSON.stringify(list2));
    } else {
      let list2: string[] = JSON.parse(localStorage.getItem('todolistDone'));    
      list2.push(title);
      localStorage.setItem('todolistDone',JSON.stringify(list2));
    }
  }

  undone(index: number): void{
    let list2: string[] = JSON.parse(localStorage.getItem('todolistDone'));    
    let title: string = list2[index];
    list2.splice(index,1);
    localStorage.setItem('todolistDone',JSON.stringify(list2));

    if (localStorage.getItem('todolist') == null) {
      let list: string[] = [];
      list.push(title);
      localStorage.setItem('todolist',JSON.stringify(list));
    } else {
      let list: string[] = JSON.parse(localStorage.getItem('todolist'));    
      list.push(title);
      localStorage.setItem('todolist',JSON.stringify(list));
    }
  }

  removeAll(): void{
    let list: string[] = JSON.parse(localStorage.getItem('todolist'));
    list.splice(0,list.length);
    localStorage.setItem('todolist',JSON.stringify(list));

    let list2: string[] = JSON.parse(localStorage.getItem('todolistDone'));
    list2.splice(0,list2.length);
    localStorage.setItem('todolistDone',JSON.stringify(list2));
  } 

  delete(index: number): void{
    let list: string[] = JSON.parse(localStorage.getItem('todolist'));
    list.splice(index,1);
    localStorage.setItem('todolist',JSON.stringify(list));
  }
  delete2(index: number): void{
    let list2: string[] = JSON.parse(localStorage.getItem('todolistDone'));
    list2.splice(index,1);
    localStorage.setItem('todolistDone',JSON.stringify(list2));
  }

  goUp(index: number): void{
    let list: string[] = JSON.parse(localStorage.getItem('todolist'));
    let title: string = list[index];
    list.splice(index,1);
    list.unshift(title);
    localStorage.setItem('todolist',JSON.stringify(list));
  }
}