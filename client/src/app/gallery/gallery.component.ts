import { Component, OnInit } from '@angular/core';
import { Plant } from '../model/plant.model';
import { PlantService } from '../plant.service';

@Component({
  selector: 'app-gallery',
  templateUrl: './gallery.component.html',
  styleUrls: ['./gallery.component.css']
})
export class GalleryComponent implements OnInit {

  plants: Plant[] = [];

  constructor(private plantService: PlantService) { }


  ngOnInit(): void {
    this.fetchPlants();
  }

  fetchPlants(): void {
    this.plantService.getPlants().subscribe(plants => {
      this.plants = plants;
    });

  }
}
