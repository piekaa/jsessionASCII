package pl.noip.piekaa.jsession.ascii;

import java.awt.image.BufferedImage;
import java.io.IOException;

public interface ImageReader 
{
	BufferedImage readImage(String path) throws IOException;
}