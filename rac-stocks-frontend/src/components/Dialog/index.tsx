import * as React from 'react';
import Button from '@mui/material/Button';
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';
import Paper, { PaperProps } from '@mui/material/Paper';
import Draggable from 'react-draggable';
import { useEffect } from 'react';

function PaperComponent(props: PaperProps) {
    return (
        <Draggable
            handle="#draggable-dialog-title"
            cancel={'[class*="MuiDialogContent-root"]'}
        >
            <Paper {...props} />
        </Draggable>
    );
}


type Props = {
    isOpen: any,
    withTitle?: boolean,
    handleClose: () => void;
};

export default function DraggableDialog(props: Props) {

    return (
        <div>
            <Dialog
                open={props.isOpen}
                onClose={props.handleClose}
                PaperComponent={PaperComponent}
                aria-labelledby="draggable-dialog-title"
            >
                {props.withTitle &&
                    <DialogTitle style={{ cursor: 'move' }} id="draggable-dialog-title">
                        More details
                    </DialogTitle>
                }
                <DialogContent>
                    <DialogContentText>
                        To subscribe to this website
                    </DialogContentText>
                </DialogContent>
                <DialogActions>
                    <Button autoFocus onClick={props.handleClose}>
                        Cancel
                    </Button>
                </DialogActions>
            </Dialog>
        </div>
    );
}