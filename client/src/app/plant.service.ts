import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Plant } from './model/plant.model'; 

@Injectable({
  providedIn: 'root'
})
export class PlantService {

  private apiUrlPlantService = 'http://localhost:8080/api/plants';

  constructor(private http: HttpClient) { }

  getPlants(): Observable<Plant[]> {
    return this.http.get<Plant[]>(this.apiUrlPlantService);
  }

}

